
public class MeasureService {
	
	public void mesasure(MeasureReq req) {
		File file = req.getFile();
		nasStorage.save(file);
		
		jdbcTemplate.update("insert into MEAS_INFO");
		
		jdbcTemplate.update("insert into BP_MOD_REQ");
	}
		

}

public class MeasureService {
	
	public void mesasure(MeasureReq req) {
		File file = req.getFile();
		s3Storage.upload(file);
		
		jdbcTemplate.update("insert into MEAS_INFO");
		
		rabitmq.convertAndSend();
	}
		

}

