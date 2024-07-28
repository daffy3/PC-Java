package org.daffy3.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

abstract public class MemoryDBRepositoryAbstract<T extends MemoryDBEntity> implements MemoryDBRepositoryIfs<T> {

    private final List<T> db = new ArrayList<>();
    private int index = 0;

    @Override
    public Optional<T> findById(int index) {
        return db.stream().filter(item -> item.getIndex() == index).findFirst();
    }

    @Override
    public T save(T entity) {
        var optionalEntity = db.stream().filter(item -> item.getIndex() == entity.getIndex()).findFirst();
        if (optionalEntity.isEmpty()) {
            // db에 이미 데이터가 없는 경우
            index++;
            entity.setIndex(index);
            db.add(entity);

            return entity;
        } else {
            // db에 데이터가 있는 경우
            var preIndex = optionalEntity.get().getIndex();
            entity.setIndex(preIndex);

            deleteById(preIndex); // 기존의 데이터를 지워주고
            db.add(entity); // 새로운 데이터를 넣어준다.

            return entity;
        }
    }

    @Override
    public void deleteById(int index) {
        var optionalEntity = db.stream().filter(item -> item.getIndex() == index).findFirst();

        if (optionalEntity.isPresent()) {
            db.remove(optionalEntity.get());
        }
    }

    @Override
    public List<T> listAll() {
        return db;
    }
}
