public class LazyInitRace {

    //늦은 초기화에서 발생하는 경쟁 조건, 잘못된 코드..
    private AbObject instance = null;
    public AbObject getInstance() {
        if(instance == null){
            instance = new ABObject();
        }
        return instance;
    }
}
