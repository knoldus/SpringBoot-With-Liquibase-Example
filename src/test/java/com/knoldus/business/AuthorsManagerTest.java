package com.knoldus.business;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.knoldus.persistence.entities.Author;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorsManagerTest {

  @Autowired
  private AuthorsManager authorsManager;

  @Test
  public void getAllAuthorsReturnDataFromDatabase() throws Exception {
    List<Author> authors = authorsManager.getAllAuthors().collect(Collectors.toList());
    assertFalse(authors.isEmpty());
    assertEquals(5, authors.size());


  }
}