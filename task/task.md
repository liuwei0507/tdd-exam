#第一轮
1.
`Given` 
    first round strike
`When`
    play bowling
`Then`
    get ten scores

2.
`Given` 
    first round spare
`When`
    play bowling
`Then`
    get ten scores

3.    
`Given` 
    first round first throw 4 balls and second throw 5 balls
`When`
    play bowling
`Then`
    get 9 scores

#第二轮
1.
`Given` 
    first round strike and second round strike
`When`
    play bowling
`Then`
    get 10+10+10(ball number)=30 scores

2.
`Given` 
    first round strike and second round first throw 4 balls and second throw 6 balls
`When`
    play bowling
`Then`
    get 10+10+10(ball number)=30 scores

3.
`Given` 
    first round strike and second round first throw 4 balls and second throw 5 balls
`When`
    play bowling
`Then`
    get 10+9+9(ball number)=28 scores

4.
`Given` 
    first round spare second round strike
`When`
    play bowling
`Then`
    get 10+10+10(ball number) scores
    
4.
`Given` 
    first round spare second round first throw 4 balls and second throw 6 balls
`When`
    play bowling
`Then`
    get 10+10+4(ball number)=24 scores
    
5.
`Given` 
    first round spare second round first throw 4 balls and second throw 5 balls
`When`
    play bowling
`Then`
    get 10+9+4(ball number)=23 scores
    


# 第三轮
1.
`Given` 
    first round strike and second round strike and third round strike
`When`
    play bowling
`Then`
    get 10+10+10+20(ball numbers) = 50 scores
    
# 第10 轮
1.
`Given` 
    tenth round strike and add throw 4 balls and 5 balls
`When`
    play bowling
`Then`
    get previous scores + 9 scores

2.
`Given` 
    tenth round spare and add throw 4 balls
`When`
    play bowling
`Then`
    get previous scores + 4 scores
