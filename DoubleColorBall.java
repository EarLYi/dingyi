import java.util.*;

public class DoubleColorBall
{

public static void main(String[] args)
{
System.out.println("请输入你需要机选的注数");
int count = new Scanner(System.in).nextInt();

for (int i = 1; i <= count; i++)
{
realize();
}

}

public static void realize()
{
int red = 33;
int blue = 16;
int numLength = 7;
int[] random = new int[numLength];

outer:
for (int i = 0; i < numLength - 1; i++)
{
int count = 0;
int redNum = new Random().nextInt(red + 1);

for (int j = 0; j < numLength - 1; j++)
{
if(redNum != random[j] && redNum != 0)
{
count++;

if(count == numLength - 1)
{
random[i] = redNum;
break;
}
else
{
continue;
}
}
else
{
i--;
continue outer;
}
} 
}

outer1:
for (int i = numLength - 1; i < numLength; i++)
{ 
int blueNum = new Random().nextInt(blue + 1);

for (int j = numLength - 1; j < numLength; j++)
{
if(blueNum != random[j])
{
random[i] = blueNum;
break;
}
else
{
i--;
continue outer1;
}
}
}

for (int i = 0; i < numLength; i++)
{
if(i > 0 && i < numLength - 1)
{
if(i != numLength - 2)
{
if(random[i] < 10)
{
System.out.print("0" + random[i] + ",");
}
else
{
System.out.print(random[i] + ",");
}
}
else
{
if(random[i] < 10)
{
System.out.print("0" + random[i]);
}
else
{
System.out.print(random[i]);
}
} 

}
else
{
if(i != 0)
{
if(random[i] < 10)
{
System.out.println("蓝球:" + "0" + random[i]);
}
else
{
System.out.println("蓝球:" + random[i]);
}

}
else
{
if(random[i] < 10)
{
System.out.print("红球:" + "0" + random[i] + ",");
}
else
{
System.out.print("红球:" + random[i] + ",");
} 

} 

}
}
}
}