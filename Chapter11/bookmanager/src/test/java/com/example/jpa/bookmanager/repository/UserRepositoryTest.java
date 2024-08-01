package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.Gender;
import com.example.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    // h2 db 주입 이슈 해결 링크
    // https://velog.io/@readnthink/DataJpaTest%EC%82%AC%EC%9A%A9%EC%8B%9C-user-table-%EC%98%88%EC%95%BD%EC%96%B4-%EC%97%90%EB%9F%AC
    @Test
    void crud() {
        User user1 = userRepository.save(new User(1, "martin", "martin@gmail.com", LocalDateTime.now(), LocalDateTime.now()));
        User user2 = userRepository.save(new User(2, "dennis", "dennis@gmail.com", LocalDateTime.now(), LocalDateTime.now()));
        User user3 = userRepository.save(new User(3, "sophia", "sophia@slow.com", LocalDateTime.now(), LocalDateTime.now()));
        User user4 = userRepository.save(new User(4, "james", "james@slow.com", LocalDateTime.now(), LocalDateTime.now()));
        User user5 = userRepository.save(new User(5, "martin", "martin@another.com", LocalDateTime.now(), LocalDateTime.now()));

        userRepository.saveAll(Lists.newArrayList(user1, user2, user3, user4, user5));

        // ====================================================================================================

        List<User> users1 = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name")); // 내림차순
        List<User> users2 = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L)); // 특정 아이디 값으로 필터링

        long count = userRepository.count();
        System.out.println(count); // 5

        boolean exists = userRepository.existsById(user1.getId());
        System.out.println(exists); // true

        // 특정 아이디 값에 관한 데이터 삭제
        userRepository.delete(userRepository.findById(1L).orElse(null));
        userRepository.delete(userRepository.findById(5L).orElseThrow(RuntimeException::new));
        userRepository.deleteById(1L);

        userRepository.findAll().forEach(System.out::println);

        // ====================================================================================================

        Page<User> users = userRepository.findAll(PageRequest.of(1, 3));
        System.out.println("page: " + users);
        System.out.println("total elements: " + users.getTotalElements());
        System.out.println("total pages: " + users.getTotalPages());
        System.out.println("Number of elements: " + users.getNumberOfElements());
        System.out.println("sort: " + users.getSort());
        System.out.println("size: " + users.getSize());

        users.getContent().forEach(System.out::println);

        // ====================================================================================================

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("name")
                .withMatcher("email", ExampleMatcher.GenericPropertyMatchers.endsWith());

        Example<User> example = Example.of(new User("ma", "gmail.com"), matcher);
        userRepository.findAll(example).forEach(System.out::println);

        // ====================================================================================================

        User user6 = new User();
        user6.setEmail("slow");

        ExampleMatcher matcher2 = ExampleMatcher.matching().withMatcher("email", ExampleMatcher.GenericPropertyMatchers.contains());
        Example<User> example2 = Example.of(user6, matcher2);

        userRepository.findAll(example2).forEach(System.out::println);

    }

    @Test
    void select() {
        User user1 = userRepository.save(new User(1, "martin", "martin@gmail.com", LocalDateTime.now(), LocalDateTime.now()));
        User user2 = userRepository.save(new User(2, "dennis", "dennis@gmail.com", LocalDateTime.now(), LocalDateTime.now()));
        User user3 = userRepository.save(new User(3, "sophia", "sophia@slow.com", LocalDateTime.now(), LocalDateTime.now()));
        User user4 = userRepository.save(new User(4, "james", "james@slow.com", LocalDateTime.now(), LocalDateTime.now()));
        User user5 = userRepository.save(new User(5, "martin", "martin@another.com", LocalDateTime.now(), LocalDateTime.now()));

        userRepository.saveAll(Lists.newArrayList(user1, user2, user3, user4, user5));

        System.out.println(userRepository.findByName("dennis"));

        // ====================================================================================================

        System.out.println("findByEmail(): " + userRepository.findByEmail("martin@gmail.com"));
        System.out.println("getByEmail(): " + userRepository.getByEmail("martin@gmail.com"));
        System.out.println("readByEmail(): " + userRepository.readByEmail("martin@gmail.com"));
        System.out.println("queryByEmail(): " + userRepository.queryByEmail("martin@gmail.com"));
        System.out.println("searchByEmail(): " + userRepository.searchByEmail("martin@gmail.com"));
        System.out.println("streamByEmail(): " + userRepository.streamByEmail("martin@gmail.com"));
        System.out.println("findUserByEmail(): " + userRepository.findUserByEmail("martin@gmail.com"));

        // ====================================================================================================

        System.out.println("findFirst1ByName(): " + userRepository.findFirst1ByName("martin"));
        System.out.println("findTop1ByName(): " + userRepository.findTop1ByName("martin"));

        // ====================================================================================================

        System.out.println("findByEmailAndName(): " + userRepository.findByEmailAndName("martin@gmail.com", "martin"));
        System.out.println("findByEmailOrName(): " + userRepository.findByEmailOrName("martin@gmail.com", "dennis"));
        System.out.println("findByCreatedAt(): " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByCreatedAtBefore(): " + userRepository.findByCreatedAtBefore(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByIdAfter(): " + userRepository.findByIdAfter(4L));
        System.out.println("findByCreatedAtGreaterThan(): " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
    }

    @Test
    void insertAndUpdateTest() {
        User user = new User();
        user.setName("marco");
        user.setEmail("marco@gmail.com");

        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("marrrrrrco");

        userRepository.save(user2);
    }
    
}