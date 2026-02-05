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

        // "images/beach.jpg"
        // testZeroBlue("images/beach.jpg");
        // testKeepOnlyRed("images/beach.jpg");
        // testKeepOnlyGreen("images/beach.jpg");
        // testKeepOnlyBlue("images/beach.jpg");
        // testNegate("images/beach.jpg");
        // testGrayscale("images/beach.jpg");
        // testEdgeDetection("images/swan.jpg", 10);
        // testGetCountRedOverValue("images/beach.jpg", 250);
        // testSetRedToHalfValueInTopHalf("images/beach.jpg");
        // testClearBlueOverValue("images/beach.jpg", 200);
        testGetAverageForColumn("images/beach.jpg", 20);
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

    public static void testGetCountRedOverValue(String fileName, int value) {
        Picture image = new Picture(fileName);
        System.out.println("In file " + fileName);
        System.out.println("Red over " + value + ": " + image.getCountRedOverValue(value));
        image.getCountRedOverValue(value);
    }

    public static void testSetRedToHalfValueInTopHalf(String fileName) {
        Picture image = new Picture(fileName);
        image.setRedToHalfValueInTopHalf();
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testClearBlueOverValue(String fileName, int value) {
        Picture image = new Picture(fileName);
        image.clearBlueOverValue(value);
        image.write(
                fileName.substring(0, fileName.indexOf(".jpg")) +
                        "-modified" +
                        ".jpg");
    }

    public static void testGetAverageForColumn(String fileName, int column) {
        Picture image = new Picture(fileName);
        System.out.println("In file " + fileName + ", column " + column);
        System.out.println("Avg color is (" +
                image.getAverageForColumn(column)[0] + ", " + 
                image.getAverageForColumn(column)[1] + ", " + 
                image.getAverageForColumn(column)[2] + ")");
    }

}