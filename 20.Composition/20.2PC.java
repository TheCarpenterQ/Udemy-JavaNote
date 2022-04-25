public class PC {  //if use inheritance:only can inherit one class once
                    //and now,PC comprises of 3 other classes
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
       monitor.drawPixelAt(1200,50,"yellow");
    }

}
