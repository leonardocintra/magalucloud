"use client";

import React, { useState } from "react";
import { Card } from "@/components/ui/card";
import { Button } from "@/components/ui/button";
import { IFilme } from "@/interfaces/IFilme";
import Image from "next/image";

const FilmeCard: React.FC<IFilme> = (filme: IFilme) => {
  const [assistido, setAssistido] = useState(filme.assistido || false);

  return (
    <Card className="bg-white rounded-lg shadow-md p-4 max-w-md">
      <Image
        src={filme.imagem}
        alt={filme.nome}
        width={1000}
        height={1000}
        className="w-full h-auto object-cover rounded-top"
      />
      <div className="mt-2">
        <h2 className="font-semibold text-lg">{filme.nome}</h2>
        <h2 className="text-gray-600">{filme.diretor}</h2>
        <h2 className="text-gray-500">{filme.genero}</h2>
      </div>
      <div className="mt-4 flex justify-end">
        <Button className="bg-blue-500 text-white px-4 py-2 rounded">
          {assistido ? "Já Assistido" : "Marcar como Assistido"}
        </Button>
      </div>
    </Card>
  );
};

export default FilmeCard;
