char* convertToTitle(int A) {
	// SAMPLE CODE
	int length;
	length = 100;
	  char *result = (char *)malloc(length * sizeof(char));
	  int n = 0,i;
	  // DO STUFF
	  int sum = 0,j = 0;
	  if(A == 1)
	  return "A";
	  while(sum < A)
	  {
	      sum += pow(26,n++);
	  }
	  //printf("%d \n",sum);
	  length = n+1;
	  for(i = 0; i < n;i++)
	  {
	    result[j++] = A/26 + 'A';
	    A /=26;
	  }
	  result[n] = '\0';
	  return result;
}