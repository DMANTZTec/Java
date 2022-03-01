package mapVsFlatMap;

import java.util.List;

public class Trainee {

    private int id;
    private String name;
    private String email;
    private List<String> courses;

    public Trainee() {
    }

    public Trainee(int id, String name, String email, List<String> courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.setCourses(courses);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

   
}
