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
		v.save(new Vulnerability("CVE-2014-6416",
				"Buffer overflow in net/ceph/auth_x.c in Ceph, as used in the Linux kernel before 3.16.3, allows remote attackers to cause a denial of service (memory corruption and panic) or possibly have unspecified other impact via a long unencrypted auth ticket.",
				"2014-09-28",
				"2015-04-29",
				"7.8",
				"Denial Of Service	Overflow	Memory corruption",
				"www.cvedetails.com/cwe-details/119/cwe.html",
				"http://tracker.ceph.com/issues/8979	http://git.kernel.org/?p=linux/kernel/git/torvalds/linux-2.6.git;a=commit;h=c27a3e4d667fdcad3db7b104f75659478e0c68d8	http://www.ubuntu.com/usn/USN-2377-1	http://www.ubuntu.com/usn/USN-2376-1	http://www.securityfocus.com/bid/69805	http://www.openwall.com/lists/oss-security/2014/09/15/7	http://www.kernel.org/pub/linux/kernel/v3.x/ChangeLog-3.16.3	http://www.ubuntu.com/usn/USN-2379-1	http://www.ubuntu.com/usn/USN-2378-1	https://github.com/torvalds/linux/commit/c27a3e4d667fdcad3db7b104f75659478e0c68d8	https://bugzilla.redhat.com/show_bug.cgi?id=1142060"));
		List<Vulnerability> t= v.findAll();
		System.out.print(t.size()+"\n"+t.toString());
	}

}
