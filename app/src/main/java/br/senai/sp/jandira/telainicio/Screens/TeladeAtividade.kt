package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R

@Composable
fun TeladeAtividade(controleDeNavegacao: NavHostController){

    Column (modifier = Modifier
        .fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)

        ) {

   Image(
       painter = painterResource(id = R.drawable.usuario), contentDescription = "",
       modifier = Modifier
           .fillMaxWidth().offset(x = -160.dp, y = 10.dp).size(50.dp).clickable { controleDeNavegacao.navigate("TelaPerfil") }
   )


            Row(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically


            )

            {
                Text(
                    text = "Matemática - Fund1",
                    fontSize = 20.sp,
                )
            }
        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(Color(0xFF1AD3FB)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Assunto 1 - Soma e subtração",
                fontSize = 20.sp,
            )
        }

        Column (modifier = Modifier
            .padding(start = 40.dp, top = 40.dp, bottom = 20.dp, end = 40.dp)
            .fillMaxWidth()
            .height(480.dp)
        ) {
            Row (modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Soma simples",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )}

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)){
                Card (modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .clickable {
                        controleDeNavegacao.navigate("TelaMultiplaEscolha")
                    },
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1AD3FB))
                ) {
                }

            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
                horizontalArrangement = Arrangement.End
            ){
                Card (modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .clickable {
                        controleDeNavegacao.navigate("TelaMultiplaEscolha")
                    },
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1AD3FB))
                ) {
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)){
                Card (modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .clickable {
                        controleDeNavegacao.navigate("TelaMultiplaEscolha")
                    },
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1AD3FB))
                ) {
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
                horizontalArrangement = Arrangement.End
            ){
                Card (modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .clickable {
                        controleDeNavegacao.navigate("TelaMultiplaEscolha")
                    },
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1AD3FB))
                ) {
                }
            }


        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(Color(0xFFE9CE03)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Assunto 2 - Soma e subtração",
                fontSize = 20.sp,
            )
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun TeladeAtividadePreview() {
    TeladeAtividade(controleDeNavegacao = NavHostController(LocalContext.current))
}