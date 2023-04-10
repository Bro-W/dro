package bean;

/**
 * @author 王国梁
 * @date 2023/3/28 18:23
 */
public class Emp {
    private String ename;
    private String egender;
    private Dept dept;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEgender() {
        return egender;
    }

    public void setEgender(String egender) {
        this.egender = egender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
