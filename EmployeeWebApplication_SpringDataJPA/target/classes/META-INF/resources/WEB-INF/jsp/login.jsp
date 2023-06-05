<html>
    <head>
        <title>
            Login Page
        </title>
        <style>
        
			
             .container {
            /*background-color: black;*/
            /*padding: 10px;*/
            display:flex; 
            align-items:center;
            justify-content:center;
            height: auto;
            background-color: dodgerblue;
            
            
           
             }
             .a{
                /* border:10px solid maroon;  */          
                width: 400px;
                height:200px;
                padding: 16px;
                background-color: white;
             }
        </style>
    </head>

    <body >
        <div class="container">
            <h1>Employee Records</h1><br><br>
            <div class="a">
                <h2>Login</h2>
                <form method="post" style="text-align: center;">
                    
                        <span style="color:red;">${errorMessage}</span>
                        
                        <div><input type="text" name="username" placeholder="Username"></div><br>
                        <div><input type="password" name="password" placeholder="Password"></div><br>
                        <input type="submit" value="Submit">
                        <!-- <table>
                            <tr><td colspan="2"></td></tr>
                            <tr><td><label>LoginID:</label></td><td></td></tr>
                            <tr><td></label>Password:</label></td><td><input type="password" name="password" ></td></tr>
                            <tr><td><input type="submit"></td></tr>
                        </table> -->
                        
                
                        
                        
                        	
                        

                    


                    
                    
                    
                </form>
            </div>
        </div>
    </body>
    
</html>