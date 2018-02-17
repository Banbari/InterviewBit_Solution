/**
 * @input A : Read only ( DON'T MODIFY ) Integer array
 * @input n1 : Integer array's ( A ) length
 * @input B : Read only ( DON'T MODIFY ) Integer array
 * @input n2 : Integer array's ( B ) length
 * 
 * @Output Double
 */
 
 int min(int a,int b)
 {
     return a<b?a:b;
 }
 
 int max(int a,int b)
 {
     return a>b?a:b;
 }
 
 int getkth(const int *s, int m,const int *l, int n, int k){
        // let m <= n
        if (m > n) 
            return getkth(l, n, s, m, k);
        if (m == 0)
            return l[k - 1];
        if (k == 1)
            return min(s[0], l[0]);

        int i = min(m, k / 2), j = min(n, k / 2);
        if (s[i - 1] > l[j - 1])
            return getkth(s, m, l + j, n - j, k - j);
        else
            return getkth(s + i, m - i, l, n, k - i);
        return 0;
    }
  
double findMedianSortedArrays(const int* nums1, int m, const int* nums2, int n) {
  int len1 = m, len2 = n;
        int k = (len1 + len2 + 1) >> 1;
        if((len1 + len2) & 1)
            return getkth(&nums1[0], len1 ,&nums2[0], len2, k); 
        else {
            return (getkth(&nums1[0], len1 ,&nums2[0], len2, k) + getkth(&nums1[0], len1 ,&nums2[0], len2, k+1)) / 2.0;;
        }   
    }
