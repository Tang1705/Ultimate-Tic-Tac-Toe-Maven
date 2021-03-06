<h1 align="center">
  <a href="https://github.com/Tang1705/Ultimate-Tic-Tac-Toe" title="Ultimate Tic-Tac-Toe Documentation">
    <img alt="Ultimate Tic-Tac-To " src="http://static.zybuluo.com/TangWill/cinm0c9yyyhzuf1d1wvj3mt1/icon.png" width="200px" height="200px" />
  </a>
  <br />
  Ultimate Tic-Tac-Toe
</h1>

<p align="center">
  一款基于 Java 的策略井字棋游戏
</p>

## Preface

You can find details of the project from https://www.zybuluo.com/TangWill/note/1442929 .

You can also download the <a href="https://github.com/Tang1705/Ultimate-Tic-Tac-Toe-Maven/blob/main/target/Ultimate-Tic-Tac-Toe-1.0-SNAPSHOT-jar-with-dependencies.jar">jar file</a>.

This repository is based on maven.


## Overall overview

### Tic-Tac-Toe
***Tic-tac-toe*** (also known as noughts and crosses or Xs and Os) is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game. 

The following example game is won by the first player, X: 

![1920px-Tic-tac-toe-game-1.svg.png-61.2kB][1]

Players soon discover that the best play from both parties leads to a draw. Hence, tic-tac-toe is most often played by young children. 

Because of the simplicity of tic-tac-toe, it is often used as a pedagogical tool for teaching the concepts of good sportsmanship and the branch of artificial intelligence that deals with the searching of game trees. It is straightforward to write a computer program to play tic-tac-toe perfectly or to enumerate the 765 essentially different positions (the state space complexity) or the 26,830 possible games up to rotations and reflections (the game tree complexity) on this space.

The game can be generalized to an m,n,k-game in which two players alternate placing stones of their own color on an m×n board, with the goal of getting k of their own color in a row. Tic-tac-toe is the (3,3,3)-game. Harary's generalized tic-tac-toe is an even broader generalization of tic-tac-toe. It can also be generalized as a nd game. Tic-tac-toe is the game where n equals 3 and d equals 2. If played properly, the game will end in a draw, making tic-tac-toe a futile game.

### Ulltimate Tic-Tac-Toe

***Ultimate tic-tac-toe***  also known as super tic-tac-toe, strategic tic-tac-toe, meta tic-tac-toe, or tic-tac-tic-tac-toe-toe is a board game composed of nine tic-tac-toe boards arranged in a 3-by-3 grid. Players take turns playing in the smaller tic-tac-toe boards until one of them wins in the larger tic-tac-toe board. Compared to traditional tic-tac-toe, strategy in this game is conceptually more difficult, and has proven more challenging for computers.

Each small 3-by-3 tic-tac-toe board is referred to as a local board, and the larger 3-by-3 board is referred to as the global board. 

The game starts with X playing wherever they want in any of the 81 empty spots. This move 'sends' their opponent to its relative location. For example, if X played in the top right square of their local board, then O needs to play next in the local board at the top right of the global board. O can then play in any one of the nine available spots in that local board, each move sending X to a different local board. 

If a move is played so that it is to win a local board by the rules of normal tic-tac-toe, then the entire local board is marked as a victory for the player in the global board. 

Once the outcome of a local board is decided (win or draw), no more moves may be played in that board. If a player is sent to such a board, then that player may play in any other board.

Game play ends when either a player wins the global board or there are no legal moves remaining, in which case the game is a draw.

![Incomplete_Ultimate_Tic-Tac-Toe_Board.png-118.2kB][2]

The board of an incomplete ultimate tic-tac-toe game (the large "X"s and "O"s representing local board games which have been won by that player). The most recent move was O playing in the middle-left square of the top-middle grid, forcing X to play their next move in the middle-left grid.

Ultimate tic-tac-toe is significantly more complex than most other variations of tic-tac-toe, as there is no clear strategy to playing. This is because of the complicated game branching in this game. Even though every move must be played in a local board, equivalent to a normal tic-tac-toe board, each move must take into account the global board in several ways: 

 1. **Anticipating the next move:** Each move played in a local board determines where the opponent's next move may be played. This might make moves that may be considered bad in normal tic-tac-toe viable, since the opponent is sent to another local board, and may be unable to immediately respond to them. Therefore, players are forced to consider the larger game board instead of simply focusing on the local board.
 
 2. **Visualizing the game tree:** Visualizing future branches of the game tree is more difficult than single board tic-tac-toe. Each move determines the next move, and therefore reading ahead—predicting future moves—follows a much less linear path. Future board positions are no longer interchangeable, each move leading to starkly different possible future positions. This makes the game tree difficult to visualize, possibly leaving many possible paths overlooked.
 
 3. **Winning the game:** Due to the rules of ultimate tic-tac-toe, the global board is never directly affected. It is only governed by actions that occur in local boards. This means that each local move played is not intended to win the local board, but to win the global board. Local wins are not valuable if they cannot be used to win the global board—in fact, it may be strategic to sacrifice a local board to your opponent in order to win a more important local board yourself. This added layer of complexity makes it harder for humans to analyze the relative importance and significance of moves, and consequently harder to play well.


## UI Dedign

### MainGUI

![maingui.PNG-1273.7kB][30]

Just as the picture shows, there are some choices in this window.

Single: Choose to play with your friends via net;

Double: Choose to play with your friends locally;

Rule: Choose to look up the rules of the game or tips;

And some rules are as following:

Firstly, I will introduce some basic rules so that you can play the game soon ——

- Each square of the 3x3 game board contains another, smaller, 3x3 game board.
- Where you make your move in a square of any small board, you send the opponent in the respective square of the big board.
- 3 in a row in a small board wins the small board and the big square.
- 3 small boards in a row wins the game.
- Strategize your play, plan your next move, let the opponent win some small boards, while you win the game!

And then, you can look through the detailed rules to find some stratege to play the game better ———

When the game starts, the player with the O piece will move first, and can place his piece wherever he wants. To let the opponent (AI，which I will descibe it later, or friend) place the first piece, you can choose to play with O. Placing the first piece will not give the player such a big advantage as in the classic tic-tac-toe game, he still needs to create a strategy in order to defeat you.

Next, your opponent will have to play the board respective to the square that you've just filled.
Your next move will be in a board that your opponent sends you to, given by the square that he just made his move on.

What happens if the opponent sends you to an already won or draw board? Then you can **go wherever you like**.

After playing a little, you will see that, even though you could win a small board easily, the fact that if the move you make would put your opponent at an advantage, you could chose to not win that board at the time, or perhaps forfeit it, if it will give you an advantage to complete other 3 boards in a row and win the match.

A draw board will not count for either X, nor O.

### OfflineGameGUI

![LocalGameGUI.PNG-1672.2kB][31]

When you play the game, the red square will remind you of the area where you can only go.

![LocalGameGUI1.PNG-1681.9kB][32]

After you win the game in the small board or win the game finally, the window will be just like this

![LocalGameGUI2.PNG-1761.5kB][33]

Besides these, you will enjoy the certain music when you play the game, which is called BGM.

### OnlineGameGUI
If you choose to press the button named single, you can play with your friend who is using the same WLAN with you.

But first, you need to log in a new account or sign up if you have had a account.

![SingleGameGUI1.PNG-1234.6kB][34]

When you log in or sign up with some errors, there will be a dialog to show something about the erroe, like signing up without account and so on.

Signing up successfully, you will see the window, wihch show some information of you, and you can creat or join a room to play with your friend.

![NetGameGUI2.PNG-1262.3kB][35]

![NetGameGUI3.PNG-1251.5kB][36]

Before your friend join the room, you can only stay in the wait window.

![NetGameGUI4.PNG-1390.2kB][37]

Next, you can play with your friend.

![NetGameGUI5.PNG-1683.6kB][38]

While your opponent will see another picture,which indicates his name on the window.

![NetGameGUI6.PNG-1681.4kB][39]

Each time you place a chess on the chessboard, the information of turn will change.

![NetGameGUI7.PNG-1682.1kB][40]

Another thing I want to explain is that the priority belongs to those who creat the room.

If one of two players wins the game, the winner's name will appear at the bottom of the window.

![NetGmeGUI11.PNG-1769kB][41]

### Other Settings
I haven't show some GUI, like GUI of logging in 、rule dialog and rank GUI.

But it maybe similar with those I have showed with you or it's so easy to make it clear for you that I won't explain them in detail.

  [1]: http://static.zybuluo.com/TangWill/eihl6ig9l86r2jfx547vm2mj/1920px-Tic-tac-toe-game-1.svg.png
  [2]: http://static.zybuluo.com/TangWill/z0cch0waqrt0758wa7y2fat8/Incomplete_Ultimate_Tic-Tac-Toe_Board.png
  [3]: http://static.zybuluo.com/TangWill/4lg5jaihji8ymk7cf70dztq5/structure.png
  [4]: http://static.zybuluo.com/TangWill/t5gbesjdd0sm74xyzuvtfl2t/%E6%8D%95%E8%8E%B7.PNG
  [5]: http://static.zybuluo.com/TangWill/0lharis80mo9tpvymtridhi1/TestServerUml.PNG
  [6]: http://static.zybuluo.com/TangWill/viv3tg484gss7jw7ugeaqx57/ServerThread.PNG
  [7]: http://static.zybuluo.com/TangWill/z6le9nd3uu5qhsw6ircrvnwv/ServerOperationUML.PNG
  [8]: http://static.zybuluo.com/TangWill/mipwvrslqilh5siopah8pa66/RoomManagerGUI.PNG
  [9]: http://static.zybuluo.com/TangWill/5hsk6eesrhyl25t5ekwm8jfy/DataBaseUML.PNG
  [10]: http://static.zybuluo.com/TangWill/1qkdevf8oq316az3143ce6l9/BeginGUIUML.PNG
  [11]: http://static.zybuluo.com/TangWill/7pc44o4u66tanytlqknjbtqo/LanGUI.PNG
  [12]: http://static.zybuluo.com/TangWill/q9ijl3v6w3ojxfw5is090hjl/LocalGameGUIUML.PNG
  [13]: http://static.zybuluo.com/TangWill/132nnwd5k5fr7uz2kkx3xxh9/LogInGUIUML.PNG
  [14]: http://static.zybuluo.com/TangWill/2ga9qj49ilyvk7a5ptzgdco0/MainGUIUML.PNG
  [15]: http://static.zybuluo.com/TangWill/dimgw3uk8hv5a2rska972umm/MetGameGUIUML.PNG
  [16]: http://static.zybuluo.com/TangWill/2tyf28bzxi4srsgz2nvynhf4/RankGUIUML.PNG
  [17]: http://static.zybuluo.com/TangWill/htvegyf4ppxb2opt83olpwpg/RoomGUIUML.PNG
  [18]: http://static.zybuluo.com/TangWill/recbfurqamsw7zkhcocn9wye/WaitGUIUML.PNG
  [19]: http://static.zybuluo.com/TangWill/qvh127ppxzn4zjh8w45jfczp/LocalOperationUML.PNG
  [20]: http://static.zybuluo.com/TangWill/v7dghpqiqohz9w7tj2autucc/NetOperationUML.PNG
  [21]: http://static.zybuluo.com/TangWill/bj51shf3fyx99l1bm5o3dgyh/OperationUML.PNG
  [22]: http://static.zybuluo.com/TangWill/3vwqbq9blvu0hd5ak15d8naw/PlayerUML.PNG
  [23]: http://static.zybuluo.com/TangWill/md2rcd7u26lpe4xgx7aqg87d/PlayerNet.PNG
  [24]: http://static.zybuluo.com/TangWill/q92ps6ot21xb31ecwh091v03/RankUML.PNG
  [25]: http://static.zybuluo.com/TangWill/kb7ng9i586iezjvyq6qvaosp/ReceiveUML.PNG
  [26]: http://static.zybuluo.com/TangWill/v2n98bbdmy2ncw1tz61y73x1/MybuttonUML.PNG
  [27]: http://static.zybuluo.com/TangWill/kc58iinsnar7km6x87hul0g9/GameButton.PNG
  [28]: http://static.zybuluo.com/TangWill/ynk86gcwlsezwhl0e5th5xbd/NetGamebuttonUTM.PNG
  [29]: http://static.zybuluo.com/TangWill/cinm0c9yyyhzuf1d1wvj3mt1/icon.png
  [30]: http://static.zybuluo.com/TangWill/uftv4l84qfdg42bynwji6c7h/maingui.PNG
  [31]: http://static.zybuluo.com/TangWill/fua4nr4v5ike6t6rgtfog8e7/LocalGameGUI.PNG
  [32]: http://static.zybuluo.com/TangWill/5gm459o8blcuqf6vefjlthr5/LocalGameGUI1.PNG
  [33]: http://static.zybuluo.com/TangWill/e6zesnleug7u3b4z7ta2mr5y/LocalGameGUI2.PNG
  [34]: http://static.zybuluo.com/TangWill/httdgqs7vehodn6vytd73o1c/SingleGameGUI1.PNG
  [35]: http://static.zybuluo.com/TangWill/e660889edhugyolsnd14g046/NetGameGUI2.PNG
  [36]: http://static.zybuluo.com/TangWill/ifbytd9zr0xegqb0v9dsruts/NetGameGUI3.PNG
  [37]: http://static.zybuluo.com/TangWill/6fskm6eb5apisz2uglhows12/NetGameGUI4.PNG
  [38]: http://static.zybuluo.com/TangWill/ypr3e2w4v7i5w7ztcf4l3y0i/NetGameGUI5.PNG
  [39]: http://static.zybuluo.com/TangWill/h1ia92rkh1t4rq39sjigenq6/NetGameGUI6.PNG
  [40]: http://static.zybuluo.com/TangWill/mokni0u2tuwz5effgcfw6h8p/NetGameGUI7.PNG
  [41]: http://static.zybuluo.com/TangWill/6w9bbzglevt7g749q7guulnm/NetGmeGUI11.PNG
  [42]: http://static.zybuluo.com/TangWill/0f1clbmnt8nvzt6mn8cza3af/satistics.PNG
  [43]: http://static.zybuluo.com/TangWill/nuwg20mzi2p4dgvudqvj0xim/1920px-Tic-tac-toe-game-1.svg.png
