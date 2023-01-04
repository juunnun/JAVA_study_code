import java.lang.reflect.Member;

import javax.naming.spi.DirStateFactory.Result;

public class changepassword {
	public Result changePassword(
			String id, String oldPw, String newPw) {
		Member mem= memberRepository.findOne(id);
		if(mem==null) {
			return Result.NO_MEMBER;
		}
	}
	try {
		mem.changePassword(oldPw,NewPw)
		return Result.SUCCESS;
	} catch(BadPasswordException ex) {
		return Result.BAD_PASSWORD
	}


}
