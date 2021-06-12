package cn.jkg.taotao.utils;


import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

/**   
 * 项目名称：taotao-manager-web   
 * 类名称：FastDFSClient   
 * 类描述：TODO   
 * 创建人：jkg   
 * 创建时间：2019年12月26日 下午11:13:34   
 * @version        
 */
public class FastDFSClient {

	private TrackerClient trackerClient = null;
	private TrackerServer trackerServer = null;
	private StorageClient storageClient = null;
	private StorageServer storageServer = null;
	
	public FastDFSClient(String configure) {
		try {
			if (configure.contains("classpath:")) {
				//全路径
				configure = configure.replace("classpath:", this.getClass().getResource("/").getPath());
			}
			ClientGlobal.initByProperties(configure);
			trackerClient = new TrackerClient();
			trackerServer = trackerClient.getConnection();
			storageServer = null;
			storageClient = new StorageClient(trackerServer, storageServer);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	/**
	 * 
	 * @Description TODO
	 * @author jkg
	 * @param fileName 文件的全路径
	 * @param extName 文件扩展名
	 * @param meta 文件扩展信息
	 * @return
	 * String
	 * @throws  
	 * @throws Exception 
	 */
	public String[] uploadFile(String fileName, String extName, NameValuePair[] meta) throws Exception {
		String[] uploadFile = storageClient.upload_file(fileName, extName, meta);
		return uploadFile;
	}
	public String[] uploadFile(String fileName, String extName) throws Exception {
		String[] uploadFile = storageClient.upload_file(fileName, extName, null);
		return uploadFile;
	}
	public String[] uploadFile(String fileName) throws Exception {
		String[] uploadFile = storageClient.upload_file(fileName, null, null);
		return uploadFile;
	}
	/**
	 * 
	 * @Description TODO
	 * @author jkg
	 * @param fileBuff 文件内容，字节
	 * @param extName
	 * @param meta
	 * @return
	 * @throws Exception
	 * String[]
	 */
	public String[] uploadFile(byte[] fileBuff, String extName, NameValuePair[] meta) throws Exception {
		String[] uploadFile = storageClient.upload_file(fileBuff, extName, meta);
		return uploadFile;
	}
	public String[] uploadFile(byte[] fileBuff, String extName) throws Exception {
		String[] uploadFile = storageClient.upload_file(fileBuff, extName, null);
		return uploadFile;
	}
	public String[] uploadFile(byte[] fileBuff) throws Exception {
		String[] uploadFile = storageClient.upload_file(fileBuff, null, null);
		return uploadFile;
	}
}
