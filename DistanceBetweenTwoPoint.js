class DistanceBetweenTwoPoint {
    distance(x1, y1, x2, y2) {
        let a = x2 - x1;
        let b = y2 - y1;
        let ans = Math.round(Math.sqrt(a * a + b * b));
        return ans;
    }
}
