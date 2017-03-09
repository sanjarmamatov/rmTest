package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
EditText et2;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent2 = getIntent();
        et2=(EditText)findViewById(R.id.editText2);
        btn2=(Button)findViewById(R.id.button);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String h = et2.getText().toString();
                if(h.equals("козерог")){
                    String name = "Козерог";
                    String description = "Вы человек трудолюбивый и добросовестный. Вам нравится, когда все сделано без сучка, без задоринки. Другие люди понимают Ваше стремление к совершенству и помогают Вам в достижении Ваших целей. Так что постарайтесь никого не разочаровать и принять правильное решение, особенно если речь идет о финансах";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);

                }
                else if(h.equals("водолей")){
                    String name = "Водолей";
                    String description = "Сегодня у Вас могут возникнуть проблемы с расстановкой приоритетов, и Вы сможете заплутать среди собственных целей и амбиций. Вы должны помнить о том, что Вам нужно действовать, а не терять кучу времени на размышления и создание грандиозных планов.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("рыбы")){
                    String name = "Рыбы";
                    String description = "Вы будете сосредоточены, и Ваши усилия не пропадут зря. Это если говорить о работе, а что касается Вашей личной жизни, Вам нужно уделить ей больше времени. Проведите приятный вечер в обществе Вашей второй половинки и уделите ей внимание.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("весы")){
                    String name = "Весы";
                    String description = "Внешние обстоятельства и ход событий облегчают принятие Вами четких и взвешенных решений. Этот день Вам стоит посвятить продуктивному труду и решению вопросов, связанных с бизнесом. Однако будьте осторожны и не растратьте всю свою энергию.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("скорпион")){
                    String name = "Скорпион";
                    String description = "В какой-то момент Вы поймете, что заработать истощение на работе проще простого, а потому Вам не нужно строить из себя ударника социалистического труда. Вместо этого постарайтесь более рационально использовать свои внутренние ресурсы и работать меньше, но более эффективно. Планирование поможет Вам не терять время даром.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("стрелец")){
                    String name = "Стрелец";
                    String description = "Сегодня будет хороший день, когда все идет по плану, и Ваши усилия не пропадают зря. Только от Вас будет зависеть Ваше продвижение по карьерной лестнице и состояние дел в личной жизни. Просто используйте свой здравый смысл для принятия решений, и все будет хорошо.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("рак")){
                    String name = "Рак";
                    String description = "Успех Вашей работы может напрямую зависеть от Вашей проницательности, а не познаний в какой-то конкретной области. Ваша интуиция позволит Вам увидеть некий новый путь, при помощи которого Вы найдете выход из сложившейся ситуации.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("лев")){
                    String name = "Лев";
                    String description = "Сегодня будет очень хороший день, который откроет перед Вами новые возможности. Может быть, Вы даже захотите сменить сферу деятельности или же что-то радикально поменять в своей личной жизни. Как бы то ни было, прежде чем действовать, Вы должно четко знать, чего хотите.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("дева")){
                    String name = "Дева";
                    String description = "Если кто-то придет к Вам за советом и помощью, не отказывайте этому человеку. Вы можете изменить его жизнь своими словами или, по крайней мере, сделать так, чтобы она не стала хуже, а это уже много. В общем-то, проявите человеколюбие, и Вам воздастся.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("овен")){
                    String name = "Овен";
                    String description = "Если кто-то из окружающих или какая-то ситуация вызывают у Вас чувство дискомфорта, значит Вам нужно от этого избавиться. Вместо этого Вам следует создать вокруг себя максимально приятную атмосферу, в которой Вы сможете творить и созидать.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("телец")){
                    String name = "Телец";
                    String description = "Сегодня Ваши коммуникативные способности будут особенно сильны, а это значит, что пришло время убедить всех, кого нужно, в своей правоте. Однако будьте осторожны и старайтесь апеллировать только к фактам.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }
                else if(h.equals("близнецы")){
                    String name = "Близнецы";
                    String description = "Сегодня Вам придется нести дополнительную ответственность за то, что Вы будете делать, и не важно, какой из жизненных сфер это будет касаться: личной жизни или профессиональной деятельности. Однако не стоит слишком уж нервничать по этому поводу. Просто идите своим путем дальше.";
                    Intent intent4 = new Intent(Main3Activity.this,Main4Activity.class);
                    intent4.putExtra("name", name);
                    intent4.putExtra("description", description);
                    startActivity(intent4);
                }





            }
        });

    }
}
