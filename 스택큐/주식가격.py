def solution(prices):
    answer = []
    
    for i in range(len(prices)-1):
        tmp = prices[i]
        count = 0
        flag=True
        for j in range(i+1,len(prices)):
            count += 1
            if tmp > prices[j]:
                answer.append(count)
                flag = False
                break
        if flag==True:
            answer.append(count)
    
    answer.append(0)
    return answer