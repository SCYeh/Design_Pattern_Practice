package Adapter;

import Adapter.Duck.Duck;
import Adapter.Turkey.Turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        // 由於Turkey飛行距離很短，為了對應到鴨子長距離的飛行，因此重複飛行5次
        for (int i = 0; i <= 5; i++) {
            turkey.fly();
        }
    }
}
