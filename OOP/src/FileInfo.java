import java.util.List;

public enum CloudID{
	DROPBOX,
	BOX;
}
public class FileInfo {
	private CloudID cloudID;
	private String fileID;
	private String name;
	private long length;
}

public class CloudFileManager{
	public List<FileInfo> getFileInfos(CloudID cloudID){
		if (cloudID =- CloudID.DROPBOX) {
			DropBoxClient dc = ...;
			...
		}
		else if(cloudID==CloudID.BOX) {
			BoxService boxSvc = ...;
			...
		}
	}
}

public void download(FileInfo file, File localTarget) {
	if(file.getCloudid()==CloudID.DROPBOX) {
		...
	}
	else if(file.getCloudid()==CloudID.BOX) {
		...
	}
}