int findHighestProfit(int arr[]) 
{ 
    int n = sizeof(arr) / sizeof(arr[0]);
    k=2;
    if (n < k) { 
        printf("Tidak bisa mendapatkan profit pada hari-hari ini\n");
        return 0; 
    } 
  
    int profit = 0,i,j; 
    for (i=0;i<n;i++){
      for (j=0;j<k-1;j++){
        if profit < (arr[i]-arr[j])
          profit=(arr[i]-arr[j]);
      }
    }
  
    return profit; 
}