package pl.learning.paintJob;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount
                (3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            double extraBucketsArea = areaPerBucket * extraBuckets;
            area = area - extraBucketsArea;
            if ((area / areaPerBucket) - ((int) Math.round(area / areaPerBucket)) > 0) {
                return ((int) Math.round(area / areaPerBucket)) + 1;
            } else {
                return (int) Math.round(area / areaPerBucket);
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            if ((area / areaPerBucket) - ((int) Math.round(area / areaPerBucket)) > 0) {
                return ((int) Math.round(area / areaPerBucket)) + 1;
            } else {
                return (int) Math.round(area / areaPerBucket);
            }
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            if ((area / areaPerBucket) - ((int) Math.round(area / areaPerBucket)) > 0) {
                return ((int) Math.round(area / areaPerBucket)) + 1;
            } else {
                return (int) Math.round(area / areaPerBucket);
            }
        }
    }
}
