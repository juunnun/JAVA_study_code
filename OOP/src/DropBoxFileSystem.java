import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class DropBoxFileSystem implements ClodFileSystem {
	private DropBoxClient dbClient = new DropBoxClient(...);
	
	@Override
	public List<CloudFile> getFiles() {
		List<DbFile> dbFiles = dbClient.getFiles();
		List<CloudFile> results = new ArrayList<>(dbFiles.size());
		for(dbFiles file : dbFiles) {
			DropBoxClodFile cf - new DropBoxClodFile(file,dbClient);
			results.add(cf);
 		}
		return results;
	}

}

public class DropBoxCloudFile implements CloudFile {
	private DropBoxClient dbClient;
	private Dbfile dbFile;
	
	public DropBoxCloudFile(DropBoxFileSystem dbFile, dbClient) {
		this.dbFile=dbFile;
		this.dbClient=dbClient;
	}
	public String getID() {
		return dbFile.getID();
	}
	public boolean hasURL() {
		return true;
	}
	...
}

public class CloudFileManager{
	public List<CloudFile> getFileInfos(CloudID cloudID) {
		CloudFileSystem fileSystem = CloudFileSystemFactory.getFileSystem(cloudID);
		return fileSystem.getFiles();
	}
	public void download() {
		...
	}
	...
}