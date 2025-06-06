# [Bronze I] 다오의 경주 대회 - 31067 

[문제 링크](https://www.acmicpc.net/problem/31067) 

### 성능 요약

메모리: 111444 KB, 시간: 812 ms

### 분류

사칙연산, 그리디 알고리즘, 구현, 수학

### 제출 일자

2025년 4월 24일 20:40:18

### 문제 설명

<p style="text-align: center;"><img alt="" src="" style="height: 304px; width: 540px;"></p>

<p style="text-align: center;">경주 연습을 하는 다오</p>

<p>다오는 경주 대회를 열기 위해 $N$개의 트랙을 준비했다. $i$번째로 경주하는 트랙의 길이는 $A_i$이다.</p>

<p>관중들은 트랙의 길이가 점점 길어져야 경주가 재미있다고 생각한다. 즉, $A_1<A_2<\cdots <A_N$인 경우 경주가 재미있다고 생각한다. 이를 위해 다오는 다음과 같은 시행을 0회 이상 할 수 있다.</p>

<ul>
	<li>$1\le i\le N$인 $i$를 고른 뒤, $i$번째 트랙의 길이를 $K$만큼 늘린다. 즉, $A_i$를 $A_i+K$로 바꾼다.</li>
	<li>위 시행은 각 $i$에 대해 최대 한 번만 할 수 있다.</li>
</ul>

<p>다오가 트랙의 길이를 점점 증가하도록 만들 수 있는지 판단하고, 만약 가능하다면 이를 위해 필요한 시행의 최소 횟수를 구하시오.</p>

### 입력 

 <p>첫째 줄에는 트랙의 수 $N$과 트랙을 늘릴 수 있는 길이 $K$가 띄어쓰기를 사이에 두고 정수로 주어진다.</p>

<p>둘째 줄에는 각 트랙의 길이를 나타내는 정수 $A_1$, $A_2$, $\cdots$, $A_N$이 띄어쓰기를 사이에 두고 주어진다.</p>

### 출력 

 <p>만약 다오가 트랙의 길이를 점점 증가하도록 만들 수 있다면, 이를 위해 필요한 최소 시행의 횟수를 출력하여라.</p>

<p>만약 다오가 트랙의 길이를 점점 증가하도록 만들 수 없다면, <code>-1</code>을 출력하여라.</p>

