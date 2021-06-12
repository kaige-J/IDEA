package cn.jkg.taotao.pojo;

/**   
 * 项目名称：taotao-common   
 * 类名称：PictureResult   
 * 类描述：TODO   
 * 创建人：jkg   
 * 创建时间：2019年12月24日 下午11:44:08   
 * @version        
 */
public class PictureResult {
	private int error;
	private String url;
	private String message;
	
	public PictureResult() {
	}

	public PictureResult(String url, String message) {
		this.error = 0;
		this.url = url;
		this.message = message;
	}
	public PictureResult(String message) {
		this.error = 1;
		this.url = null;
		this.message = message;
	}
	public PictureResult(int error, String url, String message) {
		this.error = error;
		this.url = url;
		this.message = message;
	}
	
	public static PictureResult OK(String url, String message) {
		return new PictureResult(url, message);
	}
	
	public static PictureResult ERROR(String message) {
		return new PictureResult(message);
	}
	
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
