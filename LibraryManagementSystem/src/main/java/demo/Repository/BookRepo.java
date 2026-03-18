package demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.Entity.Books;

public interface BookRepo  extends JpaRepository<Books , Integer>{

}