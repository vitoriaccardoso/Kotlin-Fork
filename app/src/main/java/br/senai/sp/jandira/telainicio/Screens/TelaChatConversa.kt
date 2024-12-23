package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatConversa(controledeNavegacao: NavHostController) {

    var textoMensagem by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xff302F2F))
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Sair do Chat",
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clickable { controledeNavegacao.navigate("TeladeAtividade") },
                    fontSize = 15.sp,
                    color = Color.White
                )
                Spacer(Modifier.weight(0.8f))
                Text(
                    text = "Chat",
                    fontSize = 20.sp,
                    color = Color.White
                )
                Spacer(Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.sinos),
                    contentDescription = "spam",
                    modifier = Modifier
                        .size(30.dp)
                )
            }

            // Chat content
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.usuario),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .padding(4.dp)
                )

                Text(
                    text = "Como posso ajudar?",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 15.sp,
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(50.dp))
                        .height(50.dp)
                        .widthIn(max = 200.dp)
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Como eu faço soma de três Números?",
                        fontSize = 13.sp,
                        color = Color.Black
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.usuario),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .padding(4.dp)
                )

                Text(
                    text = "É só você fazer 3+3+3 = 9",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 15.sp,
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(50.dp))
                        .height(50.dp)
                        .widthIn(max = 300.dp)
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Obrigada!! Esclareceu minha dúvida!!",
                        fontSize = 13.sp,
                        color = Color.Black
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.usuario),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .padding(4.dp)
                )

                Text(
                    text = "Não precisa agradecer, precisando é só chamar",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 15.sp,
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(50.dp))
                        .height(50.dp)
                        .widthIn(max = 200.dp)
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Como eu faço soma de três Números?",
                        fontSize = 13.sp,
                        color = Color.Black
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.usuario),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .padding(4.dp)
                )

                Text(
                    text = "É só você fazer 3+3+3 = 9",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 15.sp,
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(50.dp))
                        .height(50.dp)
                        .widthIn(max = 300.dp)
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Obrigada!! Esclareceu minha dúvida!!",
                        fontSize = 13.sp,
                        color = Color.Black
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.usuario),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .padding(4.dp)
                )

                Text(
                    text = "Não precisa agradecer, precisando é só chamar",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 15.sp,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(70.dp))

            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "entrar",
                            tint = Color(0xff302F2F)
                        )
                    }
                },
                value = textoMensagem,
                onValueChange = { textoMensagem = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color(0xFF666260),
                    focusedBorderColor = Color(0xFF666260),
                    unfocusedBorderColor = Color(0xFF666260),
                ),
                placeholder = {
                    Text(
                        text = "Faça uma pergunta",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi =  true)
@Composable
private fun ChatConversaPreview() {
    ChatConversa(rememberNavController())
}