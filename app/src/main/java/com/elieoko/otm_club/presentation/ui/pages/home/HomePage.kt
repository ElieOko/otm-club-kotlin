package com.elieoko.otm_club.presentation.ui.pages.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elieoko.otm_club.domain.models.Item
import com.elieoko.otm_club.R
import com.elieoko.otm_club.presentation.ui.components.Space

@Composable
fun HomePage() {
    HomePageBody()
}

@Composable
fun HomePageBody(){
    val listItems = listOf<Item>(
        Item("Programmation",R.drawable.code),
        Item("Reseaux",R.drawable.network),
        Item("Conception",R.drawable.concepts),
        Item("Architecture",R.drawable.architecture),
        Item("Programmation",R.drawable.code),
        Item("Reseaux",R.drawable.network),
        Item("Conception",R.drawable.concepts),
        Item("Architecture",R.drawable.architecture),
        )
    val state = rememberScrollState()
    Column(Modifier.background(Color(0xFF25262C))) {
        ModernPage()
        //MyClassesScreen()
//        Column(Modifier.padding(13.dp)) {
//            Label("Bienvenu !\ndans le club", fontWeight = FontWeight.Bold, color = Color.Black.copy(0.7f), size = 24, fontFamily = FontFamily.Serif)
//        }
//        Row(Modifier.fillMaxWidth().padding(6.dp), horizontalArrangement = Arrangement.SpaceBetween) {
//            Label("Modules Disponibles", fontFamily = FontFamily.Serif, color = Color.Black.copy(0.5f), fontWeight = FontWeight.Bold, size = 18)
//            Label("(10)", fontFamily = FontFamily.Serif, color = Color.Black.copy(0.5f), fontWeight = FontWeight.Bold, size = 18)
//        }
//        Space(y = 5)
//        Row(
//            modifier = Modifier.fillMaxWidth().padding(1.dp).horizontalScroll(state)
//        ) {
//            listItems.map {
//
//                CardCustomBorderColor(
//                    with = 120,
//                    height = 120,
//                    cardColor = Color(0xFFE0E7FF).copy(0.4f),
//                    strokeWidth = StrokeWidthPosition(bottom = 33f),
//                    colorBorder = BorderColorPosition(bottom = Color(0xFF445486).copy(0.9f)),
//                    shapeFigure =  RoundedCornerShape(topEnd = 45.dp, bottomStart = 45.dp),
//                ){
//
//                    Column(modifier = Modifier
//                        .fillMaxWidth()
//                        .fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
//                        IconButton(onClick = {}) {
//                            Image(
//                                painter = painterResource(id = it.icon),
//                                contentDescription = null,
//                                contentScale = ContentScale.FillHeight,
//                                colorFilter = ColorFilter.tint(color = Color.Black.copy(0.4f)),
//                                modifier = Modifier
//                                    .size(50.dp)
//                                    .clip(RoundedCornerShape(10))
//                            )
//                        }
//                        Text(text = it.name, fontWeight = FontWeight.Bold, color = Color.Black.copy(0.5f))
//                    }
//                }
//                Spacer(modifier = Modifier.width(10.dp))
//            }
//        }
//        Space(y = 150)
    }
}

@Composable
@Preview(showBackground = true)
fun HomePagePreview(){
    HomePageBody()
}


@Composable
@Preview
fun PhysicsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text("Physics", style = MaterialTheme.typography.headlineMedium)

        Image( // Placeholder
            painter = painterResource(id = R.drawable.hec),
            contentDescription = null,
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )

        Text("Advanced Physics", style = MaterialTheme.typography.titleLarge)
        Text(
            "This course serves as an introduction to the physics of force and motion...",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        InfoItem("18 online lectures", R.drawable.network)
        InfoItem("15 Chapter + 5 Test Exam", R.drawable.code)
        InfoItem("20 download resource", R.drawable.architecture)

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { /* TODO */ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text("Continue")
        }
    }
}

@Composable
fun InfoItem(text: String, icon: Int) {
    Row(modifier = Modifier.padding(vertical = 4.dp)) {
        Icon(painter = painterResource(id = icon), contentDescription = null)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text, style = MaterialTheme.typography.bodyLarge)
    }
}

@Composable
@Preview
fun MyClassesScreen() {
    Column(modifier = Modifier.padding(24.dp)) {
//        Text("Salut ! Oko Elie", style = MaterialTheme.typography.headlineSmall)
        Text("Bienvenu !\ndans le club", style = MaterialTheme.typography.headlineSmall)
        Space(y = 10)
        Text(
            text = "Qui sommes-nous ?",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF1F2937)
        )

        Text(
            text = "Nous sommes une communauté de passionné d’informatique sur: développement, design, sécurité, réseaux... Nous apprenons, créons et partageons dans un esprit d’équipe et de découverte.",
            fontSize = 18.sp,
            color = Color(0xFF64748B),
            modifier = Modifier.padding(top = 4.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))
        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E7FF).copy(0.4f)),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Icon(painterResource(R.drawable.grid), contentDescription = null, modifier = Modifier.size(40.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text("Chemistry final exams", style = MaterialTheme.typography.titleMedium)
                    Text("45 minutes", style = MaterialTheme.typography.bodyMedium)
                }
            }
        }

        Text("Activite", style = MaterialTheme.typography.titleSmall)

        Row(horizontalArrangement = Arrangement.SpaceAround) {
            SubjectChip("Atelier")
            SubjectChip("Conference")
            SubjectChip("Hackathon")
        }

//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text("Video Course", style = MaterialTheme.typography.titleSmall)
//        Card {
//            Row(modifier = Modifier.padding(16.dp)) {
//                Icon(Icons.Default.Person, contentDescription = null)
//                Spacer(modifier = Modifier.width(8.dp))
//                Column {
//                    Text("Science Technology")
//                    Text("By Nozomi Sasaki ⭐ 4.6", style = MaterialTheme.typography.bodySmall)
//                }
//            }
//        }
    }
}

@Composable
fun SubjectChip(label: String) {
    Surface(
        shape = RoundedCornerShape(24.dp),
        color = Color(0xFFE0F7FA),
        modifier = Modifier.padding(4.dp)
    ) {
        Text(label, modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp))
    }
}

@Composable
@Preview
fun MaterialsScreen() {
    Column(modifier = Modifier.padding(24.dp)) {
        Text("Materials", style = MaterialTheme.typography.headlineSmall)

        Row {
            TabChip("Document")
            TabChip("Exam")
            TabChip("Passed", selected = true)
        }

        Spacer(modifier = Modifier.height(16.dp))

        ProgressCard("Physics", "28/35", 85)
        ProgressCard("Science", "22/45", 75)
        ProgressCard("Chemistry", "12/19", 30)
    }
}

@Composable
fun TabChip(label: String, selected: Boolean = false) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = if (selected) Color(0xFFBBDEFB) else Color.LightGray,
        modifier = Modifier.padding(end = 8.dp)
    ) {
        Text(label, modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp))
    }
}

@Composable
fun ProgressCard(subject: String, status: String, percent: Int) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(subject, style = MaterialTheme.typography.titleMedium)
                Text("You have completed $status questions", style = MaterialTheme.typography.bodySmall)
            }
            CircularProgressIndicator(
                progress = percent / 100f,
                modifier = Modifier.size(48.dp),
                strokeWidth = 6.dp
            )
            Text("$percent%", modifier = Modifier.padding(start = 8.dp))
        }
    }
}


@Composable
@Preview
fun TrailScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.mountain),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        IconButton(
            onClick = { /* back */ },
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.TopStart)
                .background(Color.White.copy(alpha = 0.6f), CircleShape)
        ) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
        }

        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .background(Color.White.copy(alpha = 0.7f), RoundedCornerShape(12.dp))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text("Time\n1h 37 min", textAlign = TextAlign.Center)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .background(Color.White.copy(alpha = 0.7f), RoundedCornerShape(12.dp))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text("Distance\n3.4 km", textAlign = TextAlign.Center)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Box(
                modifier = Modifier
                    .background(Color.Gray.copy(alpha = 0.7f), RoundedCornerShape(20.dp))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("Priest Lake", color = Color.White)
            }
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
                .background(Color.DarkGray.copy(alpha = 0.7f), RoundedCornerShape(16.dp))
                .padding(12.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Place, contentDescription = null, tint = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Text("This is Colville National Forest", color = Color.White)
            }
        }
    }
}

@Composable
@Preview
fun DetailScreen() {
    Column() {
        Box {
            Image(
                painter = painterResource(id = R.drawable.hec_studeny),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .clip(RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp))
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = { /* back */ },
                    modifier = Modifier
                        .background(Color.White.copy(alpha = 0.7f), CircleShape)
                ) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                }

                IconButton(
                    onClick = { /* bookmark */ },
                    modifier = Modifier
                        .background(Color.White.copy(alpha = 0.7f), CircleShape)
                ) {
                    Icon(Icons.Default.Add, contentDescription = "Save")
                }
            }

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(start = 24.dp, bottom = 24.dp)
            ) {
                Text("Cooper’s Peak", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                Text("Colville National Forest, Colville, WA", color = Color.White, fontSize = 14.sp)
            }
        }
    }
}

@Composable
fun FilterChip(label: String, selected: Boolean) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        color = if (selected) Color(0xFFFFC0CB) else Color.LightGray,
        modifier = Modifier.padding(horizontal = 4.dp)
    ) {
        Text(label, modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
    }
}

@Composable
fun HotelCard(name: String, price: String, imageRes: Int) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .padding(end = 12.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Star, contentDescription = null, tint = Color.Yellow)
                    Text("5.0", fontWeight = FontWeight.Bold)
                }
                Text(name, fontWeight = FontWeight.Bold)
                Text("From $price / night", fontSize = 12.sp)
            }
        }
    }
}

@Composable
@Preview
fun ITClubTeamsPage() {
    val teams = listOf(
        TeamInfo(
            name = "Mobile",
            description = "L’équipe mobile développe des applications Android et iOS modernes.",
            techStack = listOf("Jetpack Compose", "SwiftUI", "Flutter"),
            imageRes = R.drawable.phone
        ),
        TeamInfo(
            name = "Reseaux",
            description = "L’équipe réseau gère l’infrastructure, la connectivité, et veille à la performance.",
            techStack = listOf("Cisco", "Switching"),
            imageRes = R.drawable.net
        ),
        TeamInfo(
            name = "UX/UI",
            description = "Cette équipe est en charge de créer des interfaces intuitives et esthétiques.",
            techStack = listOf("Figma", "+"),
            imageRes = R.drawable.zdesing
        ),
        TeamInfo(
            name = "Analyse avec Trace Compass",
            description = "Trace Compass pour visualiser, diagnostiquer et comprendre le comportement des systèmes complexes.",
            techStack = listOf("Trace Compass", "LTTng"),
            imageRes = R.drawable.trace
        ),

        TeamInfo(
            name = "Architecture Logiciel",
            description = "Cette équipe conçoit les fondations techniques des projets. Elle définit les patterns d’architecture.",
            techStack = listOf("Microservice", "Desing pattern", "+"),
            imageRes = R.drawable.zarchi
        ),
        TeamInfo(
            name = "Développement Web",
            description = "Équipe chargée des sites web du club et projets front/back.",
            techStack = listOf("Vuejs", "Laravel", "Node.js"),
            imageRes = R.drawable.zcode
        ),
        TeamInfo(
            name = "Cybersécurité",
            description = "Veille à la sécurité des projets internes et organise des CTF.",
            techStack = listOf("Linux", "Wireshark", "Burp Suite"),
            imageRes = R.drawable.znet
        )
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF25262C))
            .padding(6.dp)
    ) {
        Column(modifier = Modifier
            .padding(18.dp)) {
            Text(
                text = "Club Informatique",
                style =  MaterialTheme.typography.headlineLarge,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F2937)
            )
            Text(
                text = "Découvrez les équipes techniques 🔧",
                fontSize = 16.sp,
                style =  MaterialTheme.typography.headlineLarge,
                color = Color(0xFF6B7280),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        Column (verticalArrangement = Arrangement.spacedBy(12.dp)) {
            teams.forEach { team->
                TeamCard(team)
            }
        }
        Space(y = 120)
    }
}

@Composable
fun TeamCard(team: TeamInfo) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor =Color(0xFFE0E7FF).copy(0.4f)),
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = team.imageRes),
                contentDescription = team.name,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    text = team.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF111827)
                )
                Text(
                    text = team.description,
                    fontSize = 14.sp,
                    color = Color(0xFF111827),
                    maxLines = 4
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    team.techStack.forEach {
                        Text(
                            text = it,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .background(
                                    color = Color(0xFFE0F2FE),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                            color = Color(0xFF0284C7)
                        )
                    }
                }
//                Space(y = 10)
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.Start
//                ) {
//                    Button(
//                        onClick = { /* Action ici : ouvrir formulaire, navigation, etc. */ },
//                        shape = RoundedCornerShape(12.dp),
//                        colors = ButtonDefaults.buttonColors(
//                            containerColor = Color(0xFF3B82F6),
//                            contentColor = Color.White
//                        )
//                    ) {
//                        Text("Joindre l’équipe")
//                    }
//                }
            }
        }
    }
}

data class TeamInfo(
    val name: String,
    val description: String,
    val techStack: List<String>,
    @DrawableRes val imageRes: Int
)


@Composable
@Preview
fun HomePageClub() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF1F5F9))
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.trace),
                contentDescription = null,
                modifier = Modifier.size(40.dp),
                tint = Color(0xFF1E3A8A)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Club Informatique",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F2937)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Slogan
        Text(
            text = "Unis par la passion du code et de l’innovation 🚀",
            fontSize = 16.sp,
            color = Color(0xFF475569)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Présentation rapide


        // Nos équipes (scroll horizontal)
        Text(
            text = "Nos Équipes",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF1F2937)
        )

        Spacer(modifier = Modifier.height(12.dp))

        val teams = listOf(
            "Développement Web", "Mobile", "UX/UI", "Cybersécurité",
            "Instrumentation", "Architecture Logicielle"
        )

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            teams.forEach { team ->
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(4.dp),
                    modifier = Modifier.size(width = 160.dp, height = 100.dp)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(
                            text = team,
                            textAlign = TextAlign.Center,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF1E293B),
                            modifier = Modifier.padding(12.dp)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Call to action
        Button(
            onClick = { /* naviguer ou formulaire */ },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF3B82F6),
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Nous rejoindre", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(40.dp))
    }
}


@Composable
@Preview
fun ModernPage() {
    val state = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxSize()
        .background(Color(0xFF25262C))
    ) {
        // Titre de bienvenue
       Column(Modifier.padding(14.dp)) {
           Text(
               text = "Bienvenu !\ndans le club OTM",
               style = MaterialTheme.typography.headlineLarge,
               modifier = Modifier.padding(bottom = 10.dp)
           )

           // Sous-titre
           Text(
               text = "Qui sommes-nous ?",
               style = MaterialTheme.typography.headlineLarge,
               modifier = Modifier.padding(bottom = 8.dp)
           )

           // Description de la communauté
           Text(
               text = "Nous sommes une communauté passionnée d'informatique, explorant des domaines comme le développement, la sécurité, les réseaux... Apprenons ensemble, créons et partageons dans un esprit d'équipe.",
               style = MaterialTheme.typography.bodySmall,
               modifier = Modifier.padding(bottom = 16.dp)
           )
       }

        // Carte d'activité
//        Card(
//            shape = RoundedCornerShape(20.dp),
//            elevation = CardDefaults.cardElevation(4.dp),
//            modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp),
//            colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E7FF).copy(alpha = 0.3f))
//        ) {
//            Row(
//                modifier = Modifier
//                    .padding(16.dp)
//                    .fillMaxWidth()
//                    .clickable { /* Interaction ici */ }
//            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.grid),  // Remplacer par une icône moderne
//                    contentDescription = null,
//                    modifier = Modifier.size(48.dp).align(Alignment.CenterVertically)
//                )
//                Spacer(modifier = Modifier.width(16.dp))
//                Column(modifier = Modifier.align(Alignment.CenterVertically)) {
//                    Text("Chemistry final exams", style = MaterialTheme.typography.headlineSmall)
//                    Text("45 minutes", style = MaterialTheme.typography.bodySmall)
//                }
//            }
//        }

        // Section Activités
        Text("Activités", style = MaterialTheme.typography.headlineSmall, modifier = Modifier.padding(bottom = 8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp).horizontalScroll(state )
        ) {
            SubjectChip("Atelier", backgroundColor = Color(0xFF4A90E2), contentColor = Color.White)
            SubjectChip("Conférence", backgroundColor = Color(0xFF50E3C2), contentColor = Color.White)
            SubjectChip("Hackathon", backgroundColor = Color(0xFFFFA500), contentColor = Color.White)
            SubjectChip("Parcours", backgroundColor = Color(0xFFFFA500), contentColor = Color.White)
        }

        // Section Cours Vidéo
//        Text("Cours Vidéo", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(bottom = 8.dp))
//
//        Card(
//            shape = RoundedCornerShape(16.dp),
//            elevation = CardDefaults.cardElevation(5.dp),
//            modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp)
//        ) {
//            Row(
//                modifier = Modifier
//                    .padding(16.dp)
//                    .clickable { /* Interaction ici */ }
//            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.net),
//                    contentDescription = null,
//                    modifier = Modifier.size(40.dp).align(Alignment.CenterVertically)
//                )
//                Spacer(modifier = Modifier.width(16.dp))
//                Column(modifier = Modifier.align(Alignment.CenterVertically)) {
//                    Text("Science Technology", style = MaterialTheme.typography.bodySmall)
//                    Text("By Nozomi Sasaki ⭐ 4.6", style = MaterialTheme.typography.bodySmall)
//                }
//            }
//        }

        // Bouton d'action moderne
//        Button(
//            onClick = { /* Action pour rejoindre la communauté */ },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 16.dp)
//                .height(50.dp),
//            shape = RoundedCornerShape(12.dp),
//            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4A90E2))
//        ) {
//            Text(
//                text = "Rejoindre la communauté",
//                style = MaterialTheme.typography.bodyMedium
//            )
//        }
    }
}

// Composant SubjectChip pour les catégories
@Composable
fun SubjectChip(label: String, backgroundColor: Color, contentColor: Color) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(backgroundColor)
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable { /* Action ici */ }
    ) {
        Text(
            text = label,
            color = contentColor,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
