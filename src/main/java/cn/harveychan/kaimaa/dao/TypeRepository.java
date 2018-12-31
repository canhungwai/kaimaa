package cn.harveychan.kaimaa.dao;

import cn.harveychan.kaimaa.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Long> {

    public Type findByName(String name);

    @Query("select t from Type t")
    public List<Type> findTop(Pageable pageable);
}
