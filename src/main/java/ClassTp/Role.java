package ClassTp;

import java.util.Objects;

public class Role {
	private String nomRole;


	public boolean equals(Object o) {
		    if (this == o) return true;
		    Role role = (Role) o;
		    return Objects.equals(this.nomRole, role.nomRole);
	}
	 public int hashCode() {
	        return Objects.hash(nomRole);
	    }
	 public Role(String nomRole) {
		 this.nomRole=nomRole;
	 }
}

