package com.smart.service;

import com.github.pagehelper.PageHelper;
import com.smart.dao.UserEssayCollectionMapper;
import com.smart.dao.UserMapper;
import com.smart.dao.UserViewMapper;
import com.smart.domain.Essay;
import com.smart.domain.User;
import com.smart.domain.UserEssayCollection;
import com.smart.domain.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;

@ContextConfiguration("classpath*:/smart-context.xml")
public class ViewServiceTest extends AbstractTransactionalTestNGSpringContextTests {

  @Autowired
  private UserEssayCollectionMapper userEssayCollectionMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EssayService essayService;
    @Autowired
    private UserService userService;
    @Test
    @Rollback(false)
    public void test1(){
      Essay essay=essayService.getEssayById(new Long(1001));
      System.out.println(essay);


    }



    @Test
    @Rollback(false)
    public void test(){
        List<Essay> essays=essayService.getAllEssay(1,3);
        for(Essay essay:essays){
            System.out.println(essay.getTitle());
        }

    }




}
