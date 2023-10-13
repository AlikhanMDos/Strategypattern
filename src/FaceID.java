public class FaceID extends IphoneDecorator{
    public FaceID(Iphone iphone) {
        super(iphone);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Additional Features: FaceRecognition System\n";
    }
}
