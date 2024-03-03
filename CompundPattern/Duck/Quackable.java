package CompundPattern.Duck;

import CompundPattern.DuckObserver.Subject.DuckSubject;

public interface Quackable extends DuckSubject {
    //每一隻Duck(Quackable)都要實作registerObserver&notifyObserver，因此拆出另一個介面定義method
    //而Concrete Quackable則將method細節統一委託Concrete Subject(SubjectBehavior)進行定義及動作
    public void quack();
}
