package Day15.StreamTask;

public class Candidate {
	String name;
	String prog;
	String city;
	int exp;

public Candidate(String name2, String prog2, String city2, int exp2) {
	// TODO Auto-generated constructor stub
	this.name = name2;
	this.prog = prog2;
	this.city = city2;
	this.exp = exp2;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProg() {
	return prog;
}
public void setProg(String prog) {
	this.prog = prog;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}
@Override
public String toString() {
	return "Candidate [name=" + name + ", prog=" + prog + ", city=" + city + ", exp=" + exp + "]";
}

}
