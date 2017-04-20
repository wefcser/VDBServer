package com;

import com.model.Vulnerability;
import com.repostory.VulnerabilityRepostory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VdbserverApplicationTests {
	@Autowired
	private VulnerabilityRepostory v;
	@Test
	public void contextLoads() {
		v.save(new Vulnerability("wef"));
		List<Vulnerability> t= v.findAll();
		System.out.print(t.size()+"\n"+t.toString());
	}

}
