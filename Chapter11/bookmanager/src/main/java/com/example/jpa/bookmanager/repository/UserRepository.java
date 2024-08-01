package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // User findByName(String name);
    // List<User> findByName(String name);
    Optional<User> findByName(String name);

    User findByEmail(String email);

    User getByEmail(String email);

    User readByEmail(String email);

    User queryByEmail(String email);

    User searchByEmail(String email);

    User streamByEmail(String email);

    User findUserByEmail(String email);

    List<User> findFirst1ByName(String name);

    List<User> findTop1ByName(String name);

    List<User> findByEmailAndName(String email, String name); // 두 가지 조건을 모두 충족해야지만 쿼리 결과를 확인할 수 있다.

    List<User> findByEmailOrName(String email, String name); // 둘 중 하나의 조건만 충족해도 쿼리 결과를 확인할 수 있다.

    List<User> findByCreatedAtAfter(LocalDateTime yesterday);

    List<User> findByCreatedAtBefore(LocalDateTime yesterday);

    List<User> findByIdAfter(Long id);

    List<User> findByCreatedAtGreaterThan(LocalDateTime yesterday);

}
