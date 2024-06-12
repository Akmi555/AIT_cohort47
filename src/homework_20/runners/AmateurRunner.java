package homework_20.runners;
/*
@date 12.06.2024
@author Sergey Bugaienko
*/

public class AmateurRunner extends Human{

    {
        this.setTypeRunner("Любитель");
    }

    public AmateurRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }

    public AmateurRunner() {
        super(15, 10);
    }



}
