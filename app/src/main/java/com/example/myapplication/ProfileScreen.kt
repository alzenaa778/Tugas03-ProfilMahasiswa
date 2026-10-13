package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.components.InfoCard
import com.example.myapplication.ui.components.ProfileHeader
import com.example.myapplication.ui.components.SkillSection
import com.example.myapplication.ui.theme.ProfilAppTheme

/** Layar utama: Header -> Info cards -> Skill -> Tombol aksi/footer. */
@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {
        // Bagian 1: header
        ProfileHeader(
            name = "Alzena Azalia",
            nim = "0102523012",
            major = "Informatika",
        )

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            // Bagian 2: kumpulan kartu informasi (InfoCard dipakai 2x dengan data berbeda)
            InfoCard(
                title = "Tentang Saya",
                items = listOf(
                    "Kampus" to "Universitas (UAI)",
                    "Prodi" to "Informatika",
                    "Semester" to "5",   // TODO: sesuaikan
                    "Minat" to "Pengembangan aplikasi mobile",
                ),
            )
            InfoCard(
                title = "Kontak",
                items = listOf(
                    "Email" to "alzenaazalia@if.uai.ac.id",
                    "GitHub" to "github.com/username",   // TODO: ganti
                ),
            )

            // Bagian 3: skill
            SkillSection(
                title = "Keahlian & Minat",
                skills = listOf("Kotlin", "Jetpack Compose", "Git", "Material 3", "UI Design", "Java"),
            )

            // Bagian 4: aksi / footer
            ContactFooter()
        }
    }
}

@Composable
private fun ContactFooter() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Button(onClick = { /* static UI: belum ada aksi */ }) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(android.R.drawable.ic_dialog_email),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                )
                Text("Hubungi Saya", modifier = Modifier.padding(start = 8.dp))
            }
        }
        Text(
            text = "Tugas Pertemuan 3 - Pemrograman Bergerak",
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.secondary,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ProfileScreenPreview() {
    ProfilAppTheme {
        Surface { ProfileScreen() }
    }
}