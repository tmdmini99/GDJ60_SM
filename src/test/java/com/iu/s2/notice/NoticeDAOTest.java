package com.iu.s2.notice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s2.MyTest;


public class NoticeDAOTest extends MyTest{

	@Autowired
	private NoticeDAO noticeDAO;
	@Test
	public void test() {
		System.out.println("테슻트");
	}
	
}
