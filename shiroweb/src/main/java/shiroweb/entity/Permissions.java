package shiroweb.entity;

public class Permissions {
	private Integer permissionId;
	private String permissionName;
	private String permissionUrl;
	private String permissionDetail;
	public Permissions(Integer permissionId, String permissionName, String permissionUrl, String permissionDetail) {
		super();
		this.permissionId = permissionId;
		this.permissionName = permissionName;
		this.permissionUrl = permissionUrl;
		this.permissionDetail = permissionDetail;
	}
	public Permissions() {
		// TODO Auto-generated constructor stub
	}
	public Integer getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionUrl() {
		return permissionUrl;
	}
	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
	}
	public String getPermissionDetail() {
		return permissionDetail;
	}
	public void setPermissionDetail(String permissionDetail) {
		this.permissionDetail = permissionDetail;
	}
}
