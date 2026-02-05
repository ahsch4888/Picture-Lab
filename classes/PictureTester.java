/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods. Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
    public static void main(String[] args) {

        // testZeroBlue("images/beach.jpg");
        // testKeepOnlyRed("images/beach.jpg");
        // testKeepOnlyGreen("images/beach.jpg");
        // testKeepOnlyBlue("images/beach.jpg");
        // testNegate("images/beach.jpg");
        // testGrayscale("images/beach.jpg");
        testEdgeDetection("images/swan.jpg", 10);
    }

    public static void testZeroRed(String fileName) {
        Picture image = new Picture(fileName);
        // image.explore();
        image.zeroRed();
        // image.explore();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testZeroGreen(String fileName) {
        Picture image = new Picture(fileName);
        // image.explore();
        image.zeroGreen();
        // image.explore();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testZeroBlue(String fileName) {
        Picture image = new Picture(fileName);
        // image.explore();
        image.zeroBlue();
        // image.explore();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testKeepOnlyRed(String fileName) {
        Picture image = new Picture(fileName);
        // image.explore();
        image.zeroBlue();
        image.zeroGreen();
        // image.explore();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testKeepOnlyGreen(String fileName) {
        Picture image = new Picture(fileName);
        // image.explore();
        image.zeroRed();
        image.zeroBlue();
        // image.explore();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testKeepOnlyBlue(String fileName) {
        Picture image = new Picture(fileName);
        // image.explore();
        image.zeroRed();
        image.zeroGreen();
        // image.explore();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testNegate(String fileName) {
        Picture image = new Picture(fileName);
        image.negate();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testGrayscale(String fileName) {
        Picture image = new Picture(fileName);
        image.grayscale();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testEdgeDetection(String fileName, int edgeDist) {
        Picture image = new Picture(fileName);
        image.edgeDetection(edgeDist);
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

}