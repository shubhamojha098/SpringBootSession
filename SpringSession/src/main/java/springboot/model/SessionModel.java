package springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SessionModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String filetype;
private String filepath;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFiletype() {
	return filetype;
}
public void setFiletype(String filetype) {
	this.filetype = filetype;
}
public String getFilepath() {
	return filepath;
}
public void setFilepath(String filepath) {
	this.filepath = filepath;
}

}
