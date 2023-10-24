/**
 * First Bad Version.
 */
public class $278 extends VersionControl {

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

class VersionControl {

    private int firstBadVersion;

    boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }
}
