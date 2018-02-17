long long save(long long val) {
val %= 10000003;
while (val < 0)
val += 10000003;
return val;
}

int Solution::seats(string A) {
    vector<int> seatPositions;
int rightStart = 0;
long long sumLeft = 0, sumRight = 0;
long long sigmaNLeft = 0, sigmaNRight = 0;
for (int it = 0; it < A.length(); ++it) {
if (A[it] == 'x') {
sigmaNRight = save(sigmaNRight+seatPositions.size());
seatPositions.push_back(save(it));
sumRight = save(sumRight+it);
}
}
long long ans = LLONG_MAX;
for (int it = 0; it < A.length(); ++it) {
while ((rightStart != seatPositions.size()) and (seatPositions[rightStart] < it)) {
sumLeft = save(sumLeft+seatPositions[rightStart]);
sumRight = save(sumRight-seatPositions[rightStart]);
sigmaNLeft = save(sigmaNLeft+rightStart);
++rightStart;
sigmaNRight = save(sigmaNRight-save(seatPositions.size()-rightStart));
}
long long leftHop = save(save((it-1)*rightStart)-save(sigmaNLeft+sumLeft));
long long rightHop = save(save(sumRight-sigmaNRight)-save(it*save(seatPositions.size()-rightStart)));
ans = min(ans, save(leftHop+rightHop));
}
return (ans == LLONG_MAX ? 0 : ans);
}
