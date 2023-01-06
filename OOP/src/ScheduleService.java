import java.security.PublicKey;

public class ScheduleService {
	private UserReposiotry repository;
	private Calculator cal;
	
	public ScheduleService(UserRegistService repositoryRegistService repository) {
		this.repository = repository;
	
	}
	
	PublicKey voidKey setCalculator(Calculator Cal) {
		this.cal = cal;
	}
}
// 초기화 코드
UserRepository userRepo = new DbUserRepository();
Calculator cal = new Calculator();

ScheduleService schSvcScheduleService = new ScheduleService(userRepo);
schSvc.setCalculator(cal);