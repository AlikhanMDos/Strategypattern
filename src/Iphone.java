public class Iphone {
    private IProcessorModel processorModel;
    private ICameraModel cameraModel;
    private ISizeModel sizeModel;

    public Iphone(IProcessorModel processorModel, ICameraModel cameraModel, ISizeModel sizeModel) {
        this.processorModel = processorModel;
        this.cameraModel = cameraModel;
        this.sizeModel = sizeModel;
    }

    public String getModel() {
        return getClass().getSimpleName();
    }

    public String getDescription() {
        return "Model: " + getModel() + "\nProcessor: " + processorModel.getProcessor() + "\nCamera: "
                + cameraModel.getCamera() + "\nSize: " + sizeModel.getSize();
    }
}
