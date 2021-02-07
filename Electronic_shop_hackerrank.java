int maximum = 0;
        int sum = 0;
        for(int i = 0; i < keyboards.length; i ++){
            for(int j = 0; j < drives.length; j++){
                sum = keyboards[i] + drives[j];
                if(sum >= maximum && sum <= b){
                    maximum = sum;
                }
            }    
        }
        if(maximum == 0) return -1;
        return maximum;
