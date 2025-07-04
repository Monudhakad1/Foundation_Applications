package com.crudapp.strongfoundation_crudapp.Repository;

import com.crudapp.strongfoundation_crudapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookRepo extends JpaRepository <Book,Long >{

}
