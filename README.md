<p class="has-line-data" data-line-start="0" data-line-end="2">Animal<br>
Assignment</p>
<ol>
<li class="has-line-data" data-line-start="2" data-line-end="9">Can you implement the sing() method for the bird?<br>
a. How did you unit test it?<br>
-&gt; using ByteArrayOutputStream for test system.out.println<br>
b. How did you optimize the code for maintainability?<br>
(Ask yourself the same question for all following exercises)<br>
-&gt; Should use interface for action method and make it on new package or new class, group by something</li>
</ol>
<p class="has-line-data" data-line-start="9" data-line-end="14">Now, we have 2 special kinds of birds: the Duck and the Chicken… Can you implement them to make their own special sound?<br>
a. A duck says: “Quack, quack” -&gt; YES<br>
b. A duck can swim -&gt;YES<br>
c. A chicken says: “Cluck, cluck” -&gt; YES<br>
d. A chicken cannot fly (assumption: its wings are clipped but ignore that) -&gt;YES</p>
<p class="has-line-data" data-line-start="15" data-line-end="19">Now how would you model a rooster?<br>
a. A rooster says: “Cock-a-doodle-doo” -&gt; YES<br>
b. How is the rooster related to the chicken? -&gt; Rooster is children of Chicken<br>
c. Can you think of other ways to model a rooster without using inheritance? -&gt; we are using interface toimplement action Rooster need, so dont need using inheritance</p>
<ol start="4">
<li class="has-line-data" data-line-start="20" data-line-end="29">Can you model a parrot? We are specifically interested in three parrots, one that<br>
lived in a house with dogs one in a house with cats, the other lived on a farm next to<br>
the rooster.<br>
a. A parrot living with dogs says: “Woof, woof” -&gt; YES<br>
b. A parrot living with cats says: “Meow” -&gt; YES<br>
c. A parrot living near the rooster says: “Cock-a-doodle-doo” -&gt; YES<br>
d. How do you keep the parrot maintainable? What if we need another parrot<br>
lives near a Duck? Or near a phone that rings frequently?<br>
-&gt; I try using Abstract class for Parrot in general with implement interface sing, then If you are parrot near dog just create new class and extend from this Parrot then you must have method sing.</li>
</ol>
<hr>
<p class="has-line-data" data-line-start="2" data-line-end="3">B. Model fish as well as other swimming animals</p>
<ol>
<li class="has-line-data" data-line-start="3" data-line-end="7">In addition to the birds, can you model a fish?<br>
a. Fishes don’t sing -&gt; YES<br>
b. Fishes don’t walk - YES<br>
c. Fishes can swim -&gt; YES</li>
</ol>

<ol start="2">
<li class="has-line-data" data-line-start="8" data-line-end="13">
<p class="has-line-data" data-line-start="8" data-line-end="13">Can you specialize the fish as a Shark and as a Clownfish?<br>
a. Sharks are large and grey -&gt; YES<br>
b. Clownfish are small and colourful (orange) -&gt; YES<br>
c. Clownfish make jokes -&gt; YES<br>
d. Sharks eat other fish -&gt; YES</p>
</li>
</ol>

<ol start="3">
<li class="has-line-data" data-line-start="8" data-line-end="13">
<p class="has-line-data" data-line-start="8" data-line-end="13">Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?<br>
a. A caterpillar cannot fly -&gt; YES<br>
b. A caterpillar can walk (crawl) -&gt; YES<br>
 </p>
</li>
</ol>
Can you share the code to count:-> YES

