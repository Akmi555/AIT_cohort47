package homework_22.systems2;
/*
@date 14.06.2024
@author Sergey Bugaienko
*/

public abstract class VusaMember {

    private final String currency;

    private double courseBTC;

    public VusaMember(String currency) {
        this.currency = currency;
        setActualBtcCourse();
    }

    public void setActualBtcCourse() {
        // запрос на сервер платежной системы
        // получать актуальный курс и присвоение его в поле
        this.courseBTC = 60_000;
    }

    public String getCurrency() {
        return currency;
    }

    public double getCourseBTC() {
        return courseBTC;
    }

    public void setCourseBTC(double courseBTC) {
        this.courseBTC = courseBTC;
    }
}
